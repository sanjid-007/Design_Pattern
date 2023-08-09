public class IClient {

    public static void main(String[] args) {
        IJSON json = new IJSON("json data");
        IProtobuffer protobuffer = new IProtobuffer("protobuffer data");

        IAdapter<IJSON> iAdapter = new IJsonToXmlAdapter(json);

        IAdapter<IProtobuffer> iAdapter2 = new IProtobufferToXmlAdapter(protobuffer);
        IXML xml = iAdapter.convert(json);
        IXML xml2 = iAdapter2.convert(protobuffer);

        System.out.println(xml.getData());
        System.out.println(xml2.getData());
    }

}
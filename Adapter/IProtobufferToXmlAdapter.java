public class IProtobufferToXmlAdapter implements IAdapter<IProtobuffer> {
    private IProtobuffer protobuffer;

    public IProtobufferToXmlAdapter(IProtobuffer protobuffer) {
        this.protobuffer = protobuffer;
    }

    @Override
    public IXML convert(IProtobuffer protobuffer) {
        return this.protobuffer.convertToXML();
    }
}
public class IJsonToXmlAdapter implements IAdapter<IJSON> {
    private IJSON json;

    public IJsonToXmlAdapter(IJSON json) {
        this.json = json;
    }

    @Override
    public IXML convert(IJSON json) {
        return this.json.convertToXML();
    }
}
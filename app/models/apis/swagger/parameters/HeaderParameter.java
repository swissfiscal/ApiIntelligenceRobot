package models.apis.swagger.parameters;

public class HeaderParameter extends AbstractSerializableParameter<HeaderParameter> {

    public HeaderParameter() {
        super.setIn("header");
    }
}

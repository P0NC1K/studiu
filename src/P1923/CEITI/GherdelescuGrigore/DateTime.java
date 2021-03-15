package P1923.CEITI.GherdelescuGrigore;

public class DateTime {
    private String oraDecolarii;
    private String ziuaDecolarii;

    public DateTime(String oraDecolarii, String ziuaDecolarii) {
        this.oraDecolarii = oraDecolarii;
        this.ziuaDecolarii = ziuaDecolarii;
    }

    public String getOraDecolarii() {
        return oraDecolarii;
    }

    public String getZiuaDecolarii() {
        return ziuaDecolarii;
    }
}

package P1923.CEITI.GherdelescuGrigore;

public class DateTime {
    private String OraDecolarii;
    private String ZiuaDecolarii;

    public DateTime(String oraDecolarii, String ziuaDecolarii) {
        OraDecolarii = oraDecolarii;
        ZiuaDecolarii = ziuaDecolarii;
    }

    public String getOraDecolarii() {
        return OraDecolarii;
    }

    public String getZiuaDecolarii() {
        return ZiuaDecolarii;
    }
}

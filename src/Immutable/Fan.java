package Immutable;

public class Fan {
    private String ComapnyName;
    private String fanColor;
    private String fanSpeed;

    public Fan(String comapnyName,String fanColor,String fanSpeed){
        this.ComapnyName=comapnyName;
        this.fanColor=fanColor;
        this.fanSpeed=fanSpeed;

    }

    public String getComapnyName() {
        return ComapnyName;
    }

    public String getFanColor() {
        return fanColor;
    }

    public String getFanSpeed() {
        return fanSpeed;
    }


}


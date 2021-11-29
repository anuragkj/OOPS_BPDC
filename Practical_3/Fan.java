import java.util.Scanner;1

enum Speed{
    s1,s2,s3,s4,s5;
}
class Fan{
    private String fanType, manufacturer, model;
    private Boolean isOn;
    public Speed spd;
    
    public void setFan(String fanType, String manufacturer, String model, Boolean isOn, Speed spd){
        this.fanType = fanType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isOn = isOn;
        this.spd = spd;
    }
    int s = 1;
    public void getFan(){
        if(spd == Speed.s1){s = 1;}
        if(spd == Speed.s2){s = 2;}
        if(spd == Speed.s3){s = 3;}
        if(spd == Speed.s4){s = 4;}
        if(spd == Speed.s5){s = 5;}
        if(isOn == true){
            System.out.println("The fan is ON. It of the type " + fanType + " and has the manufacturer " + manufacturer + ". The mode is " + model + ". Speed is " + s + ".");
        }
        else{
            System.out.println("The fan is OFF. It of the type " + fanType + " and has the manufacturer " + manufacturer + ". The mode is " + model + ".");
        }
    }

    public void on(){
        isOn = true;
    }

    public void off(){
        isOn = false;
    }
    public void speedUp(){
        if(spd == Speed.s1){ spd = Speed.s2;}
        else if(spd == Speed.s2){ spd = Speed.s3;}
        else if(spd == Speed.s3){ spd = Speed.s4;}
        else if(spd == Speed.s4){ spd = Speed.s5;}
    }
    public void speedDown(){
        if(spd == Speed.s5){ spd = Speed.s4;}
        else if(spd == Speed.s4){ spd = Speed.s3;}
        else if(spd == Speed.s3){ spd = Speed.s2;}
        else if(spd == Speed.s2){ spd = Speed.s1;}
    }

    public static void main(String[] args){
        Fan obj = new Fan();
        Speed spd = Speed.s1;
        obj.setFan("Ceiling", "Bajaj", "I305", true , spd);
        obj.getFan();
        obj.speedUp();
        obj.getFan();
        obj.speedDown();
        obj.getFan();
        obj.off();
        obj.getFan();
        obj.on();
        obj.getFan();
    }
}

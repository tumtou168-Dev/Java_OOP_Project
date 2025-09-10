package net.widget.justic;

public class Police {
    private int gun;

    public int getGun(){
        return gun;
    }

    protected void shoot(){
        System.out.println("Shoot");
    }
}

class Test{
    public void sayHello(){
        Police police = new Police();
        police.shoot();
    }
}

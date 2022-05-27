public class Main {
    public static void main(String[] args) {
        Chrager ch = new Chrager();
        V380charger v380charger = new V380charger();
        PowerAdapter pa = new PowerAdapter(v380charger);

        ch.charging();

        pa.charging();
    }
}
class V380charger{
    void charging(){
        System.out.println("Заряжаю 380 вольт");
    }
}
interface V220{
    void charging();
}
class Chrager implements V220{
    @Override
    public void charging() {
        System.out.println("Заряжаю 220 вольт");
    }
}
class PowerAdapter implements V220 {
    private V380charger v380charger;

    public PowerAdapter(V380charger v380charger){
        this.v380charger = v380charger;
    }
    @Override
    public void charging() {
        v380charger.charging();
    }
}
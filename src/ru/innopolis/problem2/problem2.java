// your solution here
//fix all the errors including package errors
public interface LightningPort {

    void chargeByLightning();

}

public class ChargerStation {

    void chargeByLightning(LightningPort lightningPort){
        lightningPort.chargeByLightning();
    }
}




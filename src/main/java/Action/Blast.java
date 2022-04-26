package Action;

import Element.Avatar;

public class Blast extends Shoot{

    private int volumeOfBlastMetresCubed;



    public Blast(int distance, int amount, Avatar avatar, int volumeOfBlast){
        super(distance, amount, avatar);
        this.volumeOfBlastMetresCubed = volumeOfBlast;

    }

    public int getVolumeOfBlastMetresCubed() {
        return volumeOfBlastMetresCubed;
    }

    public void setVolumeOfBlastMetresCubed(int volumeOfBlastMetresCubed) {
        this.volumeOfBlastMetresCubed = volumeOfBlastMetresCubed;
    }
}

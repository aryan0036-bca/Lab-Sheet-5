interface Camera { void takePhoto(); }
interface MusicPlayer { void playMusic(); }
class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() { System.out.println("Photo captured."); }
    public void playMusic() { System.out.println("Music is playing."); }
}
class Q16_SmartphoneInterfaces {
    public static void main(String[] args) { Smartphone phone = new Smartphone(); phone.takePhoto(); phone.playMusic(); }
}

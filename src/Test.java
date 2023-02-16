public class Test {
    public static void main(String[] args) {
        Musicorganizer musicorganizer = new Musicorganizer();
        System.out.println(musicorganizer.getNumberOfTracks());
        musicorganizer.listByArtist("woody");
        musicorganizer.playTrack(0);
    }

}

public interface Problem32 {
    void play();
}
class Football implements Problem32{
    @Override
    public void play(){
        System.out.println("The Boys Are Playing Football");
    }
}
class Cricket implements Problem32{
    @Override
    public void play(){
        System.out.println("The Boys Are Playing Cricket");
    }
}

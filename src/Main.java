public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, I'm practicing");
        Something s=new Something();
        System.out.println(s.num);
        
        NewFeature nf=new NewFeature();
        nf.just=somethingwrong;
        nf.newOne="Without error";
    }
}
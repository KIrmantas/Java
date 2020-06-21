package bir21;

public class Try1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            int x = arr[10] / 0;
            System.out.println("Try");
//        } catch (ArithmeticException e) {       // klaidos apdorojamos nuo smulkiausios iki stambiausios klaidos
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {       // kelias klaidas galima sujungti su '|'
//        } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {                 // tai auksciausia klaidos klase
            System.out.println("Dalyba is 0 negalima");
        } finally {
            System.out.println("Filally"); // visada vykdoma net esant klaidai
            // dazniausiai naudojamas failu uzdarymui
        }
        System.out.println("Finish");
    }
}

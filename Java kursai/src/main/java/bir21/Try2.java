package bir21;

public class Try2 {
    public static void main(String[] args) {
        int[] someArray = {3, 4, 2};
        try {
            printArrayElement(someArray, 3);
            //            throw new Exception("Tai rankiniu budu sukurta klaida");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {       // kelias klaidas galima sujungti su '|'
            System.out.println(e.getMessage());
        } catch (Exception e) {                 // tai auksciausia klaidos klase
            System.out.println("Dalyba is 0 negalima");
        } finally {
            System.out.println("Filally"); // visada vykdoma net esant klaidai
            // dazniausiai naudojamas failu uzdarymui
        }
        System.out.println("Finish");
    }

    private  static void printArrayElement(int[] intArray, int index) throws Exception {
        if (index < 0 || index >= intArray.length) {
            throw new Exception("Indeksas uz masyvo ribu");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2; //kalan=remainder
        System.out.println(remainder);
        boolean isPrime = true;  //asal mı?

        if(number==1){
            System.out.println("Sayi asal degildir");
            return;  //eger bu sart saglanıyorsa return diyerek aşağı blokların çalışmaması sağlanır
        }

        if(number<1){
            System.out.println("Gecersiz sayi");
        }

        for(int i = 2; i<number; i++ ){ // 2 den 24 e kadar olan sayılardan
            if(number % i == 0){ //bütün sayılarda herhangi bi sayıya bölünen bi sayı oluyorsa eger
                isPrime = false; //bu sayı asal değildir
            }
        }

        if(isPrime){
            System.out.println("Sayi asaldir");
        }else{
            System.out.println("Sayi asal degildir");
        }
    }
}

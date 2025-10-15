

/*import java.util.Scanner;

//psvm + tab -> cu phap nhanh -> public static void main
//sout +tab -> cu phap nhanh -> System.out.printf
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        do
        {
             n =sc.nextLong();
        }while(n<=0);
        
        int dem =0 ;
        while(n!=0){
            n= n/10;
            dem++;
        }
        System.out.println(dem);    
          
    }
   
}
 */
//tinh tong chu so cua n
/*
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tong = 0;
        while(n!=0){
        tong += n%10;
        n = n/10;
    }
        System.out.println(tong);
    }
}
 */
 /*
import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
    }
}
 */
 /*
import java.util.Scanner;

public class Bai1{
    //tim uoc chung lon nhat  (euculid)
    public static int uoc(int a, int b){
//Bien doi (a,b) => (b, a%b)
    while(b!=0){
    int r = a%b;
    //hoan doi vtri
    a=b;
    b=r;
}
    return a;
}
    
public static int boicnn(int a, int b){
    return a*b/uoc(a, b);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(boicnn(26,18) + " "+ uoc(26,18));
    }
}


 */
 /*
//phan tich thua so nguyen to
import java.util.Scanner;

public class Bai1{
    
    //ham ktra xem co phai la so nguyen to khong
    public static boolean nguyenTo(int n){
        if(n<2){
            return false;
    }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
            return false;

            }
        }
     return true;
    }    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        //1<=p*p<=n -> 1<=p<=sqrt(n)
        for(int i=1;i<=Math.sqrt(n);i++){
            if(nguyenTo(i)){
                System.out.println(1L*i*i+ " ");
            }
        }
    }
}

 */
 /*
//tinh day fibonacci
// vd 16 = 0   1   1   2   3   5   8   13 ->false 
//        fn2  fn1
import java.util.Scanner;

public class Bai1{
   public static boolean fb(long n){
       if(n==0||n==1){
           return true;
       }
       long fn1 = 1;
       long fn2 = 0;
       for(int i=2;i<=92;i++)  //day fb so 92 la gioi han cua so long
       {
           long fn = fn1+ fn2;
           if(fn == n)  //kiem tra xem n co phai la 1 so trong day fb kh
           {
               return true;
           }
           //gan len cai tiep theo
           fn2 = fn1;
           fn1 = fn; //bang chinh cai so do 
       }
       
       return false;  //duyet het 92 so thi false
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        System.out.println(fb(n));
        
}
}
 */


 /*
//bac cua thua so nguyen to trong N!
// 6! = 720
//720/2(p) = 360 -> 360/2 ...
import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p=sc.nextInt();
        long gt=1;

        //tinh giai thua
        for(int i=1;i<=n;i++){
            gt*=i;
        }
        System.out.println(gt);
        int dem = 0;
        while(gt%p==0) //dem xem 720 chia het dc cho may lan so 2
        {
            dem++;
            gt = gt/p;
        }
        System.out.println(dem);
    }
}



 */
//  (tim bac cua thua so nguyen to lon va nhanh hon)
// 10 ! =1*2*3*4*5*6*7*8*9*10
//muon biet dc cai tich chia het dc toi da cho 2 mu may
//duyet cac boi cua 2 (2 co 1 so 2, 4 co 2 so 2, 6 co 2 so 2, 8 co 3 so 2, 10 co 1 so 2)
// -> 2^(1+2+2+3+1)
/*

import java.util.Scanner;

public class Bai1 {

    public static int degree(int n, int p) {
    int sum = 0;
//duyet cac boi cua p<=n
        for (int i = p; i <= n; i += p) //vd p=2 ta chi duyet cac so 2 4 6 8..
{
            int j = i;  //lay tung so co the chia het cho 2 (lay so chan)
            while (j % p == 0) {
                sum++;
                j = j / p;  //cu chia vd nhu so 8 cu chia cho 2 roi dem xem co bao nhieu so 2
            }
        }
        return sum;  //tong sl chia het cho 2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = sc.nextInt();
        System.out.println(degree(n, p));

    }
}
*/




/*
//ve hinh thoi
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(i<=n){
                    if((j>=n-(i-1))&&j<= (n + (i - 1))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if((j >= i - n + 1)&&(j <= 2 * n - 1 - (i - n))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(""); //het 1 dong thi xuong dong
        }
   
        
    }
}
*/



/*
//hàm tìm so luong uoc của 1 số là số nguyên tố
import java.util.Scanner;

public class Bai1 {
    
    
    public static int uocNguyenTo(int n){
        int ans = 0;
        System.out.print("Cac so nguyen to cua " + n + " la: ");
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){       // nếu i là ước
                ++ans;            // đếm thêm 1 số nguyên tố
                System.out.print(i + " ");  // in ra i
                while(n % i == 0){   // bỏ hết bội số của i
                    n /= i;
                }
            }
        }
        if(n > 1){   // nếu còn lại 1 số nguyên tố lớn hơn sqrt(n)
            ++ans;
            System.out.print(n + " ");
        }
        System.out.println(); // xuống dòng
        return ans;
    }

    public static void main(String[] args) {
        int n = 60;
        int dem = uocNguyenTo(n);
        System.out.println("So luong uoc nguyen to khac nhau: " + dem);
    }
}

*/


/*
//hàm liệt kê số chính phương nằm trong đoạn từ a -> b
//so chinh phuong la so nam trong doan tu a -> b khi binh phuong van thuoc doan do
//tai sao co ct sqrt(a) -> sqrt(b) ?
//vi a <= i*i <= b  -> duyet tu sqrt(a) <= i <=sqrt(b)

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        int c1 = (int)Math.sqrt(a);
        int c2 = (int)Math.sqrt(b);
        if(1l * c1 *c1 < a){
            c1++; //vd sqrt(10) = 3 ma 3*3 = 9 (k thuoc doan a,b)
        }
        for(int i = c1;i <=c2; i++ ){
            System.out.println(1l*i*i + " ");
        }
       
    }
}
*/



/*Một số được coi là thuần nguyên tố nếu nó là số nguyên tố, tất cả các chữ số
là nguyên tố và tổng chữ số của nó cùng là 1 số nguyên tố. Bài toán đặt ra là
đếm xem trong một đoạn giữa hai số nguyên cho trước có bao nhiêu số thuần là
nguyên tố
*/

/*
import java.util.Scanner;

public class Bai1 {
public static boolean nguyento(int n){
    if(n<2)
    {
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i == 0)
        {
            return false;
        }
    }
    return true;
}

public static boolean check(int n){
    int tong = 0;
    while(n!=0){
        int r = n%10; //kiem tra tung so cuoi do co phai la snt khong
        if(r!=2&&r!=3&&r!=5&&r!=7){
            return false;
        }
        tong +=r;
        n = n/10; //1234/10 = 123 (xet tung so)
    }
    return nguyento(tong); //check xem tong tung so so co la snt khong
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int dem = 0;
        for(int i = a;i<=b;i++){
            if(check(i)&&nguyento(i)){
                dem++;
            }
        }
        System.out.println(dem);
}
}
*/


//Cho so tu nhien n. Nhiem vu cua ban la in ra uoc so nguyen to nho nhat cua cac so
//tu 1 -> n. Uoc so nguyen to nho nhat cua 1 la 1. Uoc so nguyen to nho nhat cua cac so
//chan la 2. Uoc so nguyen to nho nhat cua cac so nguyen to la chinh no

/*
import java.util.Scanner;

public class Bai1 {
    
    public static int uoc(int k){
        for(int i = 2; i<= Math.sqrt(k);i++){
            if(k%i == 0){
            return i;
        }
        }
        return k;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n;i++) //duyet tung so tu 1 -> n
        {
            System.out.println(uoc(i));
        }

}
}
*/



//Bai 12: Phan tich thua so nguyen to
/*
Hay phan tich mot so nguyen duong N thanh thua so nguyen to
vd:
intput: 60
output: 2^2 * 3^1 *5^1
*/
/*
import java.util.Scanner;

public class Bai1 {

    public static void solve(long n) {
        for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0){
                int dem = 0;
                while(n%i == 0) //vong lap tim boi cua 2 60/2 30/2 
                {
                    dem++; //dem so mu cua thua so nto i
                    n =n/i;
                }
                System.out.print(i + "^" + dem );
                if(n != 1)
                    System.out.print("*");
            }
        }
        if(n != 1){
            System.out.print(n + "^1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        solve(n);
    }
}
*/

//Bai 15: So Sphenic
/*
So nguyen duong N duoc goi la so Sphenic neu N duoc phan tich duy nhat duoi dang
tich cua BA thua so nguyen to khac nhau. Vi du N = 30 la so Sphenic vi 30 = 2x3x5
,N = 60 khong phai so Sphenic vi 60 = 2x2x3x5
*/

/*
import java.util.Scanner;

public class Bai1 {

    public static int Sphenic(long n) {
       int res = 0;
       for(int i = 2;i<= Math.sqrt(n);i++){
           int dem = 0;
           while(n%i == 0){
               dem++;
               n = n/i;
           }
           if(dem >= 2)
           {
               return 0;
           }
           else if(dem == 1)
           {
               res++;
           }
       }
       if(n!=1){
           res++;
       }
       if(res == 3 ){
           return 1;
       }
       else
       {
           return 0;
       }
     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(Sphenic(n));
      
    }
}
*/


//Bai 18: Binh phuong nguyen to 1
/*
Mot so duoc coi la so dep khi no dong thoi vua chia het cho mot so nguyen to va
chia het cho binh phuong cua so nguyen to do. Viet chuong trinh liet ke cac so dep
nhu vay trong mot doan giua hai so nguyen duong cho truoc

input:
4 50
output
4 8 9 12 16 18 20 24 25 ... 50
*/
/*
import java.util.Scanner;

public class Bai1 {
    public static boolean solve(int n){
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                int dem = 0;
                while(n%i == 0){
                    dem++;
                    n = n/i;   //chia het cho 1 so nguyen to i va chia het cho binh phuong cua so i do
                }
                
                if(dem > 1){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        for(int i =a;i<=b;i++){
            if(solve(i)){
                System.out.print(i + " ");
            }
        }
    }
}
*/



//Bai 19:  Binh phuong nguyen to 2
/*
Mot so duoc coi la so dep khi neu no chia het cho mot so nguyen to nao do thi
cung phai chia het cho binh phuong cua so nguyen to do
*/

/*
import java.util.Scanner;

public class Bai1 {
//ptich thua so nguyen to nhu bth (neu mu no bang 1 thi false) va con so cuoi la mu 1 thi false luon
    public static boolean soDep2(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            int dem = 0;
            while(n%i == 0){
                dem++;
                n = n/i
;            }
            if(dem == 1){
                return false;
            }
        }
        
        if(n != 1)  //con 1 so trong n 2^2 * 5 (con so 5 -> false)
{
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        for(int i = a;i<=b;i++){
            if(soDep2(i)){
                System.out.print(i + " ");
            }
        }
}
}
*/


//Bai 26: So Hoan Hao
/*
So hoan hao la so co tong cac uoc thuc su (Khong tinh chinh no) bang chinh so do
Cho mot so nguyen duong n, kiem tra xem n co phai la so hoan hao hay khong
vd: n = 6: Ước = 1 + 2 + 3 = 6 → in ra YES.
*/
/*
import java.util.Scanner;

public class Bai1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ------- Code --------
        long n = sc.nextLong();
        if (solve(n))
            System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean solve(long n) {
        long tong = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                tong += i;
                if (n / i != i) {  //tránh cộng trùng khi i*i == n
                    tong += n / i;  // cộng thêm ước đối xứng  2 thi la 4 vi no 
                                    //chi chay toi sqrt(n)
                }
            }
        }
        return tong - n == n;
    }
}
*/

//Bai 35: Uoc chung lon nhat, boi chung nho nhat
/*
Tim uoc chung lon nhat va boi chung nho nhat cua 2 so nguyen
1->10^12 //a*b se bi tran
*/

/*
import java.util.Scanner;

public class Bai1 {
    //ham tinh uoc chung lon nhat
    public static long uoccln(long a, long b){
        //thuật toán Euclid
        if(b == 0)
        {
            return a;
        }
        return uoccln(b, a%b);
    }
//  GCD(12, 8)
//→ GCD(8, 12 % 8) = GCD(8, 4)
//→ GCD(4, 8 % 4) = GCD(4, 0)
//→ trả về 4.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a =sc.nextLong(), b = sc.nextLong();
        long UCLN = uoccln(a, b);
        long BCNN = a/UCLN * b; //(a*b)/ucln thi se bi tran 
        System.out.print(UCLN + " " + BCNN);
}
}

*/


//DE BAI: Dem chu so 0 lien tiep tinh tu cuoi cua N!
/*
In ra so luong chu so 0 lien tiep tinh tu cuoi cua N!. Vi du ban co N = 10
10! = 3628800. Nhu vay 10! co 2 chu so 0 lien tiep tinh tu cuoi

Goi y: So 0 o cuoi cua N! co duoc bang cach nhan so 2 voi so 5, cu moi cao (2,5)
trong N! se tao ra 1 so 0 o cuoi vi the so luong chu so 0 lien tiep tinh tu cuoi
cua N! se bang so cap (2,5) trong N!, ma so luong so 2 trong N! bao gio cung lon
hon so luong so 5 trong N! ->So cap (2,5) trong N! chinh la so luong so 5 trong
N! hay noi cach khac ta se di tim bac cua 5 trong N!

output: in ra sl chu so 0 lien tiep . Ket qua lay du voi 10^9+7
*/

/*
import java.util.Scanner;

public class Bai1 {
    
    //ham tinh bac cua 5 trong n!  //ct Legendre chi ap dung khi p la snt
    //ct tinh bac cua thua so nguyen to trong n! =  [n/p] + [n/(p*p)] + ...
    public static long bac(long n, long p){
        long ans = 0;
        for(long i = p; i<=n; i *= p) //
        {
            ans += n/i;  
            ans %= 1000000007; //tinh den dau chia du den day tranh bi tran
        }
        return ans%1000000007;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(bac(n, 5));
}
}


*/


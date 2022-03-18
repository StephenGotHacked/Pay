public class Pay
{ 
        static float workhours, ratepay, withholding, grosspay, netpay;
           public static void main(String[] args){
                workhours = 5.65f;
                ratepay = 0.10f;    
                withholding = 0.10f;
                grosspay = workhours*ratepay;
                netpay = compute(withholding, grosspay);
                
                System.out.println("Your Netpay will be: ₱" + netpay);
                System.out.println("Stephen David Q. Condino 1.4BSIT");
}
                public float multiply(float workhours, float ratepay){
                    return workhours * ratepay;
}
                public static float compute(float withholding, float grosspay){
                    return (grosspay - withholding) * 100;
    
         }
}

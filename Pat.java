public class Pat{
    //pattern a
    static void a(int i,int l){
        for(int j=0;j<l+l;j++){
            if(i==l-j||(i==l/2&&j>l/2&&j<l+l/2)||i+l==j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
    }
    //pattern b
    static void b(int i,int l){
        for(int j=0;j<l;j++){
            if(i==0||i==l-1||j==1||j==l-1||(i==l/2&&j>0)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern c
    static void c(int i,int l){
        for(int j=0;j<l;j++){
            if(j==0||i==l-1||i==0){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern d
    static void d(int i,int l){
        for(int j=0;j<l;j++){
            if(i==0||i==l-1||j==1||j==l-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern e
    static void e(int i,int l){
        int e=l/2,e2=e/2,e3=e2/2;
        for(int j=0;j<l;j++){
            if(i==0||(i==l/2&&j<e+e2+e3)||i==l-1||j==0){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern f
     static void f(int i,int l){
        int e=l/2,e2=e/2,e3=e2/2;
        for(int j=0;j<l;j++){
            if(i==0||(i==l/2&&j<e+e2+e3)||j==0){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern g
    static void g(int i,int l){
        for(int j=0;j<l;j++){
            if(j==0||i==l-1||i==0||(i==l/2&&j>l/2)||(j==l-1&&i>l/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern h
     static void h(int i,int l){
        int e=l/2,e2=e/2,e3=e2/2;
        for(int j=0;j<l;j++){
            if(j==0||j==l-1||i==l/2){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern i
     static void i(int i,int l){
        int e=l/2,e2=e/2,e3=e2/2;
        for(int j=0;j<l;j++){
            if(i==0||i==l-1||j==l/2){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern j
    static void j(int i,int l){
        int e=l/2,e2=e/2,e3=e2/2;
        for(int j=0;j<l;j++){
            if(i==0||(i==l-1&&j<l/2)||j==l/2||(j==0&&i>l/2+(l/2)/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern k
    public static void k(int i,int l){
        for(int j=0;j<l;j++) {
            if(j==l/2-1||(i==l-j-1&&i<=l/2)||(i==j&&i>l/2)){
                System.out.print("* ");
            }
            else if(j>l/2-1){
                System.out.print("  ");
            }
        }
    }
    //pattern l
    static void l(int i,int l){
        int e=l/2,e2=e/2,e3=e2/2;
        for(int j=0;j<l;j++){
            if(j==0||i==l-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
  
    //pattern m
    static void m(int i,int l){
        int e=l/2,e2=e/2,e3=e2/2;
        for(int j=0;j<l;j++){
            if(j==0||j==l-1||(i==j&&i<l/2)||(i==l-j-1&&i<=l/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern n
     static void n(int i,int l){
     
        for(int j=0;j<l;j++){
            if(j==0||j==l-1||i==j){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern o
    static void o(int i,int l){
       
        for(int j=0;j<l;j++){
            if(j==0||j==l-1||i==0||i==l-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern p
     static void p(int i,int l){
       
        for(int j=0;j<l;j++){
            if(j==0||(j==l-1&&i<l/2)||i==0||i==l/2){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern q
     static void q(int i,int l){
       
        for(int j=0;j<l+l/4;j++){
            if(j==0||j==l-1||(i==0&&j<l-1)||(i==l-1&&j<l-1)||(i+l/4==j&&i>l/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern r
    static void r(int i,int l){
       
        for(int j=0;j<l;j++){
            if(j==0||(j==l-1&&i<l/2)||i==0||i==l/2||(i==j&&i>l/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     // pattern s
     static void s(int i,int l){
        for(int j=0;j<l;j++){
            if((j==0&&i<l/2)||(i==l/2&&j<l)||(i==0&&j<l)||(i==l-1&&j<l)||(j==l-1&&i>l/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern t
    static void t(int i,int l){
       
        for(int j=0;j<l;j++){
            if(j==l/2||i==0){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern u
     static void u(int i,int l){
        for(int j=0;j<l;j++){
            if(j==0||j==l-1||i==l-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
     //pattern v
     static void v(int i,int l){
        for(int j=0;j<l+l;j++){
            if(i==j||i==l+l-j-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
    }
     //pattern w
     static void w(int i,int l){
        for(int j=0;j<l;j++){
            if(j==0||j==l-1||(i==j&&i>l/2)||(i==l-j-1&&i>=l/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
   
    //pattern x
    static void x(int i,int l){
        for(int j=0;j<l;j++){
            if(i==j||i==l-j-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern y
    static void y(int i,int l){
        for(int j=0;j<l;j++){
            if(i==l-j-1||(i==j&&i<l/2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    //pattern z
    static void z(int i,int l){
        for(int j=0;j<l;j++){
           if(i==0||i==l-1||i==l-j-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    
}

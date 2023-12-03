public class Number {
    int n,d=0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
public void setDandN(int n,int d){
        this.d=d;
        this.n=n;
}
    public int calculation() {
        if (this.d == 0) {
            this.d = n - 1;
        }
        while (this.d >= 2) {
            if (n % this.d == 0) {
                return 0;
            } else {
                Number rec = new Number();
                rec.setDandN(n, this.d - 1);
                return rec.calculation();
            }
        }
        return 1;
    }
    public void putOut(int a){
        if(a==0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }

    @Override
    public String toString() {
        return String.format("%d",this.n);
    }
    public void Multiplizers(){
        int buf=this.n;
        int multiplier=2;
        while((buf>1)&&(multiplier<=Math.sqrt(buf))){
            if(buf%multiplier==0){
                System.out.println(multiplier+" ");
                buf/=multiplier;
            } else if (multiplier==2) {
                multiplier++;
            }else{
                multiplier+=2;
            }
        }
        if(buf!=1){
            System.out.println(buf);
        }
    }
}

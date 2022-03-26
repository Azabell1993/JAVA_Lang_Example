public class Calculator {
    int SUM(int x, int y) { 
        while(y != 0) {
            int temp = x&y;
            x = x^y;
            y = temp <<1;
        }
        return x;
    }

    double AVG(int x, int y) {
        double sum = SUM(x, y);
        double result = sum / 2;
        return result;
    }

    int SUB(int x, int y) { 
        while(y != 0) {
            int temp = ~x&y;
            x = x^y;
            y = temp <<1;
        }
        return x;
    }
    
    int MUL(int x, int y) {
        int temp = 0;
        while (y != 0) {
            if ((y & 1) == 1) {
                temp += x;
            }
            x = x << 1;
            y = y >> 1;
        }
        return temp;
    }
    
    int DIV(int x, int y) {
        int result = 1;
        int remainder = 0;
    
        int neg = 1;
        if ((x>0 &&y<0)||(x<0 && y>0))
        {
            neg = -1;
        }
            
        int tempx = (x < 0) ? -x : x;
        int tempy = (y < 0) ? -y : y;
    
        if (tempy == tempx) {
            remainder = 0;
            return 1*neg;
        }
        else if (tempx < tempy) {
            if (x < 0)
                remainder = tempx*neg;
            else
                remainder = tempx;
            return 0;
        }
    
        while (tempy<<1 <= tempx)
        {
            tempy = tempy << 1;
            result = result << 1;
        }
    
        if(x < 0)
            result = result*neg + DIV(-(tempx-tempy), y);
        else
            result = result*neg + DIV(tempx-tempy, y);
    
         return (result);
    }   
}

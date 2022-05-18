class Solution {
    public String intToRoman(int num) {
        char [] ans = new char [15];

    	

    	int i=0;								// To keep track of the index

    	

    											// Add characters to array according to the number

    	

    	int n=num/1000;							// For Ms

    	while (n-->0) 

    		ans[i++]='M';

    	num%=1000;

    	

    	if (num>=900) {							// For CMs

    		ans [i++]='C';

    		ans [i++]='M';

    		num-=900;

    	}

    	

    	n=num/500;

    	while (n-->0) 

    		ans[i++]='D';

    	num%=500;

    	

    	if (num>=400) {

    		ans [i++]='C';

    		ans [i++]='D';

    		num-=400;

    	}

    	

    	n=num/100;

    	while (n-->0) 

    		ans[i++]='C';

    	num%=100;

    	

    	if (num>=90) {

    		ans [i++]='X';

    		ans [i++]='C';

    		num-=90;

    	}

    	

    	n=num/50;

    	while (n-->0) 

    		ans[i++]='L';

    	num%=50;

    	

    	if (num>=40) {

    		ans [i++]='X';

    		ans [i++]='L';

    		num-=40;

    	}

    	

    	n=num/10;

    	while (n-->0) 

    		ans[i++]='X';

    	num%=10;

    	

    	if (num>=9) {

    		ans[i++]='I';

    		ans[i++]='X';

    		num-=9;

    	}

    	

    	n=num/5;

    	while (n-->0) 

    		ans[i++]='V';

    	num%=5;

    	

    	if (num>=4) {

    		ans[i++]='I';

    		ans[i++]='V';

    		num-=4;

    	}

    	

    	while (num-->0) 

    		ans[i++]='I';

    	

        return new String(ans,0,i);
    }
}

/*

*/
package edu.fju.exam.Bubble;

public class Bubble2 {
	public static void main(String[] args) {
		int n []  = { 6, 5, 2, 8, 1, 9, 13, 4, 11, 7};
		int i,j;
		for(i=0;i<n.length-1;i++){
			for(j=0;j<n.length-1;j++){
			if(n[j+1]>n[j]){
			int tmp=n[j];
			n[j]=n[j+1];
			n[j+1]=tmp;
			
			
}
}
}
		for(i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
}
}
}
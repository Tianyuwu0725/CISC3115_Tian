static int m1(int[] a) {
	int sum=0;
	for(int i=0;i<a.length;i++) 
		if(a[i]>i && a[i]%9==0)
			sum+=a[i];
		return sum;
}

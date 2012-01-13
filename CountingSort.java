/*
 * Author Farhan Khwaja ( www.code2learn.com )
 *
 */
public class CountingSort {

	private static int[] c;
	
	public void CountSort(int[] a, int[]b ,int k){
		c=new int[k+1];
		for(int i=0;i<=k;i++){
			c[i]=0;
		}
		for(int i=0;i<a.length;i++){
			c[a[i]]=c[a[i]]+1;
		}
		for(int i=1;i<=k;i++){
			c[i]=c[i]+c[i-1];
		}
		for(int i=a.length-1;i>=0;i--){
			b[c[a[i]]-1]=a[i];
			c[a[i]]=c[a[i]]-1;
		}
	}
	
	public static void main(String[] args) {
		int l[]={2,5,3,0,2,3,0,3};
		int k[]=new int[l.length];
		new CountingSort().CountSort(l, k, 5);
		for(int i=0;i<k.length;i++){
			System.out.print(k[i]);
		}
	}
}
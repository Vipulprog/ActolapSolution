package vipulproject;

public class MinDiff {
	public static void main(String[]args){
		int [] a={1, 5, 3, 19, 18, 25};
		int [] b=new int[a.length];
		int temp=0;
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){

				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is ");
		for(int i=0; i<a.length; i++){
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}

		System.out.println();

		int tot=b.length; int remp=0; int x=0; int y=0;
		for(int i=0;i<b.length-1;i++)
		{
			int count=0;
			for(int j=b[i]; j<b[i+1]; j++)
			{
				count=count+1;

			}
			if(count<tot){
				x=b[i];
				y=b[i+1];
				remp=count;
				count=tot;
				tot=remp;
			}
		}
		System.out.print("Minimum difference between the elements "+x+" and "+y+" of array is "+tot);

	}
}



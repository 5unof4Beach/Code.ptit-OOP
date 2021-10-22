public class DayConTangDan {
    public static int binArr[];
    public static int a[];
    public static int n;
    public static Vector<String> allStrings = new Vector<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = Integer.parseInt(sc.nextLine());
        a = new int[n];
        binArr = new int[n+1];
        Arrays.fill(binArr , 0);
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        binBackTrack(1);
        Collections.sort(allStrings);
        for(String i:allStrings){
            System.out.println(i);
        }
    }
    
    public static void binBackTrack(int i){
        for(int j=0; j<=1; j++){
		binArr[i]=j;		//khong co rang buoc, j duoc chap thuan
		if(i==n)	//X[i] la thanh phan cuoi cung, in cau hinh
                    solution();
		else		//X[i] chua phai la thanh phan cuoi, sinh cac xau tu X[i+1]
                    binBackTrack(i+1);
	}
	return;
    }
}
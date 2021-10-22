#include <iostream>
using namespace std;
int n, X[100], count=1, unused[100];
void print(){
	cout << "\n" << count++ << ": ";
	for(int j=1; j<=n; j++) cout << X[j] << " ";
}
void BackTrack(int i){	//Liet ke cac hoan vi cua 1..n bat dau tu X[i]
	//Xet cac kha nang cua X[i]
	for(int j=1; j<=n; j++){
		if(unused[j]==1){	//Xet kha nang j da duoc su dung chua?
			X[i]=j;			//chua duoc su dung, j duoc chap thuan
			unused[j]=0;	//danh dau kha nang j da duoc su dung
			if(i==n)		//X[i] la thanh phan cuoi cung, in cau hinh
				print();
			else			//X[i] chua phai la thanh phan cuoi, sinh tiep bat dau tu X[i+1]
				BackTrack(i+1);
			unused[j]=1;	//tra lai kha nang j chua duoc su dung
		}
	}
	return;
}
int main() {
	n=5;
	//khoi tao trang thai cua cac kha nang j: chua duoc su dung
	for(int j=1; j<=n; j++)	unused[j]=1;
	BackTrack(1);	//Liet ke cac to hop chap k cua 1..n, bat dau tu X[1]
	return 0;
}
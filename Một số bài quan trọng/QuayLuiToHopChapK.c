#include <iostream>
using namespace std;
int n, k, X[100], count=1;
void print(){
	cout << "\n" << count++ << ": ";
	for(int j=1; j<=k; j++) cout << X[j] << " ";
}
void BackTrack(int i){	//Liet ke cac to hop chap k cua 1..n bat dau tu X[i]
	//Xet cac kha nang cua X[i]
	for(int j=X[i-1]+1; j<=n-k+i; j++){
		X[i]=j;		//khong co rang buoc, j duoc chap thuan
		if(i==k)	//X[i] la thanh phan cuoi cung cua to hop, in cau hinh
			print();
		else		//X[i] chua phai la thanh phan cuoi, sinh cac to hop bat dau tu X[i+1]
			BackTrack(i+1);
	}
	return;
}
int main() {
	n=5;	k=3;	X[0]=0;
	BackTrack(1);	//Liet ke cac to hop chap k cua 1..n, bat dau tu X[1]
	return 0;
}
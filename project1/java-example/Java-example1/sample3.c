#include<stdio.h>

int main(){
    int arr[10],n,input,i=0;
    int aftercalculate[10];
    scanf("%d",&n);
    while(n>0){
        scanf("%d",&input);
        arr[i]=input;
        aftercalculate[i]=0;
        while(input>0){
            aftercalculate[i]+=input%10;
            input=input/10;
        }
        n--;
        i++;
    }
    for(int j=0;j<i-1;j++){
        for(int r=0;r<i-j-1;r++){
            if(aftercalculate[r]>aftercalculate[r+1]){
                int tmp=aftercalculate[r];
                aftercalculate[r]=aftercalculate[r+1];
                aftercalculate[r+1]=tmp;
                tmp=arr[r];
                arr[r]=arr[r+1];
                arr[r+1]=tmp;
            }
            if(aftercalculate[r]==aftercalculate[r+1]){
                if(arr[r]>arr[r+1]){
                    int tmp=arr[r];
                    arr[r]=arr[r+1];
                    arr[r+1]=tmp;
                }
            }
        }
    }
    for(int j=0;j<i;j++){
        if(j<i-1)printf("%d ",arr[j]);
        else printf("%d\n",arr[j]);
    }
}
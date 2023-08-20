#include<stdio.h>
void main(){
    int i,n,j;
     int a[100][100];
    printf("enter n:");
    scanf("%d",&n);
    for(i=0;i<n;i++){scanf("%d",&a[0][i]);
        for(j=0;j<n;j++){
    
           a[j][i]=a[0][i];

        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%d",a[i][j]);
        }
        printf("\n");
    }
}
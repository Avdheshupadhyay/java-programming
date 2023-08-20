#include<stdio.h>
void main()
{
    int i,j,k,n;
    printf("ENTER THE ORDER OF MATRIX: ");
    scanf("%d",&n);
    int a[n][n];
    for(i=0;i<1;i++){
        for(j=0;j<n;j++){
            printf("ENTER THE ELEMENT: ");
            scanf("%d",&a[i][j]);
            for(k=0;k<n;k++){
                a[k][j]=a[i][j];
            }
        }

    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}
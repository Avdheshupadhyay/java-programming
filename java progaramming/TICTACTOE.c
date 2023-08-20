#include<stdio.h>
void main()
{

    int flg=1,i,j,n,m,a[3][3],count=0,p1=0,p2=0;
    printf("00 01 02\n10 11 12\n20 21 22\n");
    
    while(flg){

        count+=1;
        printf("PLAYER 1\n");
        printf("ENTER THE PLACE VALUE OF X:\n");          //FOR PLAYER 1 INPUT
        scanf("%d %d",&m,&n);
        a[m][n]=1;        
        
        printf("\n");
        
        if(count>=3){
        for(i=0;i<3;i++){
            for(j=0;j<1;j++){
                
            if(a[i][j]==a[i][j+1] && a[i][j]==a[i][j+2]){  //FOR CHECKING HORIZONTALLY
                flg=0;
                p1=1;
                break;                                 
            }                
            
            else if(a[j][i]==a[j+1][i] && a[j][i]==a[j+2][i]){
            flg=0;
            p1=1;                                    //FOR CHECKING VERTICALLY
            break;
            
            }
        }
    }
        
        if(a[0][0]==a[1][1] && a[0][0]==a[2][2]){
        flg=0;
        p1=1;                   //FOR PRIMARY DIAGONAL CHECKING
        break;
        }

        else if(a[2][0]==a[2][2] && a[2][2]==a[0][2]){
        flg=0;
        p1=1;                   //FOR SECONDARY DIAGONAL CHECKING
        break;
        }

        }
        
        if(flg){
        
        printf("PLAYER 2\n");
        printf("ENTER THE PLACE VALUE OF O:\n");  //FOR PLAYER 2 INPUT
        scanf("%d %d",&m,&n);
        a[m][n]=0;
        
        }
        if(count>=3){
        for(i=0;i<3;i++){
            for(j=0;j<1;j++){
                
            if(a[i][j]==a[i][j+1] && a[i][j]==a[i][j+2] && flg){  
                
                flg=0;
                p2=1;           //FOR HORIZONTAL CHECKING
                break;                                  
            }                
            else if(a[j][i]==a[j+1][i] && a[j][i]==a[j+2][i] && flg){
            
            flg=0;
            p2=1;               //FOR VERTICAL CHECKING
            break;
            }

            }
        }
        
        if(a[0][0]==a[1][1] && a[0][0]==a[2][2] && flg){
        
        flg=0;
        p2=1;           //FOR PRIMARY DIAGONAL CHECKING
        break;
        
        }

        else if(a[2][0]==a[2][2] && a[2][2]==a[0][2] && flg){
        
        flg=0;
        p2=1;           //FOR SECONDARY DIAGONAL CHECKING
        break;
        
        }
        }
        printf("\n\n");

        if(count==9)
        flg=0;

    }
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }

    if(p1)
    printf("PLAYER 1 WON\n\n");
    else if(p2)
    printf("PLAYER 2 WON\n\n");
    else
    printf("DRAW\n\n");
}
import java.util.Scanner;public class RottenApples{
    public static void main (String[]args){
        int [][] ratings= {{4,6,2,5},{7,9,4,8},{6,9,3,7}};
        double ans=0;
        //QUESTION 1:
        ans=movieAvgRating(ratings,0);
        System.out.println("Average 0 movie rating: " + movieAvgRating(ratings,0));
        //QUESTION 2:
        System.out.println("");
        System.out.println("Average 0 reviewer rating: " + reviewerAvgRating(ratings,0));
        //QUESTION 3:
        System.out.println("");
        System.out.println("Average rating of 2018 movies: " + avgRating2018(ratings));
        //QUESTION 4:
        System.out.println("");
        System.out.println("The hardest rater of the year was: " + hardestRater2018(ratings));
        //QUESTION 5:
        System.out.println("");
        System.out.println("The worst movie of the year was: " + worstMovie2018(ratings) );
    }

    public static double movieAvgRating(int[][] ratings, int movie){
        double tot=0;
        for(int r=0; r<ratings.length;r++){
            tot+=ratings[r][movie];
        }
        return tot/ratings.length;  
    }

    public static double reviewerAvgRating(int[][] ratings, int reviewer){
        double tot=0;
        for(int c=0; c<ratings[reviewer].length; c++){
            tot+=ratings[reviewer][c];  
        }
        return tot/ratings[reviewer].length;
    }

    public static double avgRating2018(int[][] ratings){
        double tot=0.0;
        for(int r=0; r<ratings.length; r++){
            for(int c=0; c<ratings[r].length;c++){
                tot += ratings[r][c];
            }
        }

        return tot/(ratings.length*ratings[0].length);
    }

    public static int hardestRater2018(int[][] ratings){
        int h=-1;
        double score=100;
        double count=0;
        for(int r=0; r<ratings.length; r++){
            for(int c=0; c<ratings[r].length;c++){
                count += ratings[r][c];
                if(c+1==ratings[r].length){
                    if(score>count/ratings[r].length){
                        score=count/ratings[r].length;
                        h=(int)r;
                    }
                    count=0;
                }
            }
        }

        return h;
    }

    public static int worstMovie2018(int[][] ratings){
        int w=-1;
        double score=100;
        double count=0;
        for(int c=0; c<ratings[0].length;c++){
            for(int r=0; r<ratings.length; r++){
                count += ratings[r][c];
                if(r+1==ratings.length){
                    if(score>count/ratings.length){
                        score=count/ratings.length;
                        w=(int)c;
                    }
                    count=0;
                }
            }
        }

        return w;

    }
}



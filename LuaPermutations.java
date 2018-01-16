
package luapermuations;

public class Luapermuations {
    
    public static void main(String[] args) {
        System.out.println("adaptResolution(826, 1472);");
        System.out.println("adaptOrientation(ORIENTATION_TYPE.PORTRAIT);");
        System.out.println();
        
        System.out.println("function restartApp ()");//loop only
        System.out.println("appKill(\"com.bitmango.ap.wordcookies\");");//loop only
        System.out.println("usleep(2000000);");//loop only
        System.out.println("appRun(\"com.bitmango.ap.wordcookies\");");//loop only
        System.out.println("usleep(8000000);");//loop only
        System.out.println("tap(450,1000);");//loop only
        System.out.println("usleep(4000000);");//loop only
        System.out.println("end");//loop only
        System.out.println();//loop only
        
        System.out.println("function permutate ()");//loop only
        PixelPoints t = new PixelPoints(415,910);
        PixelPoints tl = new PixelPoints(235,1005);
        PixelPoints tr = new PixelPoints(590,1005);
        PixelPoints bl = new PixelPoints(235,1220);
        PixelPoints br = new PixelPoints(530,1220);
        PixelPoints b = new PixelPoints(415,1310);
        PixelPoints[] pparr = {t,tl,tr,bl,br,b};
    for(int i = 0; i < pparr.length; i++){
        for(int j = 0; j < pparr.length; j++){
            for(int k = 0; k < pparr.length; k++){
                for(int l = 0; l < pparr.length; l++){
                    for(int m = 0; m < pparr.length; m++){
                        for(int n = 0; n < pparr.length; n++){
                        if(i != j && i != k && i!= l && i != m && i != n && j != k && j != l && j != m && j != n && k != l && k != m && k != n && l != m && l != n && m != n){
                            System.out.println("if getColor(800,925) ~= 13864514 then return end");//loop only
                            System.out.println("touchDown(0, " + pparr[i].x + ", " + pparr[i].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[j].x + ", " + pparr[j].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[k].x + ", " + pparr[k].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[l].x + ", " + pparr[l].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[m].x + ", " + pparr[m].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[n].x + ", " + pparr[n].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchUp(0, " + pparr[n].x + ", " + pparr[n].y + ");");
                            System.out.println("usleep(75000);");
                            System.out.println();
                        }
                        }
                    }
                }
            }
        }
    }
    for(int i = 0; i < pparr.length; i++){
        for(int j = 0; j < pparr.length; j++){
            for(int k = 0; k < pparr.length; k++){
                for(int l = 0; l < pparr.length; l++){
                    for(int m = 0; m < pparr.length; m++){
                        if(i != j && i != k && i!= l && i != m && j != k && j != l && j != m && k != l && k != m && l != m){
                            System.out.println("if getColor(800,925) ~= 13864514 then return end");//loop only
                            System.out.println("touchDown(0, " + pparr[i].x + ", " + pparr[i].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[j].x + ", " + pparr[j].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[k].x + ", " + pparr[k].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[l].x + ", " + pparr[l].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchMove(0, " + pparr[m].x + ", " + pparr[m].y + ");");
                            System.out.println("usleep(60000);");
                            System.out.println("touchUp(0, " + pparr[m].x + ", " + pparr[m].y + ");");
                            System.out.println("usleep(75000);");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
    for(int i = 0; i < pparr.length; i++){
        for(int j = 0; j < pparr.length; j++){
            for(int k = 0; k < pparr.length; k++){
                for(int l = 0; l < pparr.length; l++){
                    if(i != j && i != k && i!= l && j != k && j != l && k != l){
                        System.out.println("if getColor(800,925) ~= 13864514 then return end");//loop only
                        System.out.println("touchDown(0, " + pparr[i].x + ", " + pparr[i].y + ");");
                        System.out.println("usleep(60000);");
                        System.out.println("touchMove(0, " + pparr[j].x + ", " + pparr[j].y + ");");
                        System.out.println("usleep(60000);");
                        System.out.println("touchMove(0, " + pparr[k].x + ", " + pparr[k].y + ");");
                        System.out.println("usleep(60000);");
                        System.out.println("touchMove(0, " + pparr[l].x + ", " + pparr[l].y + ");");
                        System.out.println("usleep(60000);");
                        System.out.println("touchUp(0, " + pparr[l].x + ", " + pparr[l].y + ");");
                        System.out.println("usleep(75000);");
                        System.out.println();
                }
            }
        }
    }
    }
    for(int i = 0; i < pparr.length; i++){
        for(int j = 0; j < pparr.length; j++){
            for(int k = 0; k < pparr.length; k++){
                if(i != j && i != k && j != k){
                    System.out.println("if getColor(800,925) ~= 13864514 then return end");//loop only
                    System.out.println("touchDown(0, " + pparr[i].x + ", " + pparr[i].y + ");");
                    System.out.println("usleep(60000);");
                    System.out.println("touchMove(0, " + pparr[j].x + ", " + pparr[j].y + ");");
                    System.out.println("usleep(60000);");
                    System.out.println("touchMove(0, " + pparr[k].x + ", " + pparr[k].y + ");");
                    System.out.println("usleep(60000);");
                    System.out.println("touchUp(0, " + pparr[k].x + ", " + pparr[k].y + ");");
                    System.out.println("usleep(75000);");
                    System.out.println();
                }
            }
        }
    }
    for(int i = 0; i < pparr.length; i++){
        for(int j = 0; j < pparr.length; j++){
            if(i != j){
                System.out.println("if getColor(800,925) ~= 13864514 then return end");//loop only
                System.out.println("touchDown(0, " + pparr[i].x + ", " + pparr[i].y + ");");
                System.out.println("usleep(60000);");
                System.out.println("touchMove(0, " + pparr[j].x + ", " + pparr[j].y + ");");
                System.out.println("usleep(60000);");
                System.out.println("touchUp(0, " + pparr[j].x + ", " + pparr[j].y + ");");
                System.out.println("usleep(75000);");
                System.out.println();
            }
        }
    }
    System.out.println("end");//loop only
    System.out.println("permutate();");//loop only
    System.out.println("restartApp();");//loop only
    
    }
}

public class Main {
    
    public static void main(String[] args) throws Exception {
        TeamPlane teamPlane = new TeamPlane(100);
        EnemyPlane enemyPlane = new EnemyPlane(100);

        for(int i =0;;i++){
            if(teamPlane.getHealth() == 0){
                System.out.println("적팀 비행기가 이김");
                break;
            }else if(enemyPlane.getHealth() == 0){
                System.out.println("우리팀 비행기가 이김");
                break;
            }else{
                // 우리팀 비행기 턴
                if(i%2==0){
                    if(enemyPlane.randGetAway()){
                        continue;
                    }
                    try{
                        teamPlane.attack();
                        enemyPlane.defense();
                    }catch(Exception e){
                        enemyPlane.printError();
                        break;
                    }
                    
                }else{
                    // 적팀 비행기 턴
                    if(teamPlane.randGetAway()){
                        continue;
                    }
                    try{
                        enemyPlane.attack();
                        teamPlane.defense();
                    }catch(Exception e){
                        teamPlane.printError();
                        break;
                    }
                }
            }
            
        }
    }
}

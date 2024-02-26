public class EnemyPlane implements Plane{

    private int health;

    public EnemyPlane(int health){
        this.health = health;
    }

    @Override
    public boolean randGetAway() {
        if(Math.random()<=0.5){
            return false;
        }else{
            return true;
        }
        
    }

    @Override
    public void attack() {
        if(this.health < 30){
            this.health += 4;
        }
        System.out.println("적팀 비행기 공격 성공!! ( 현재 체력 : "+this.health+" )");
    }

    @Override
    public void defense() throws Exception{
        if(this.health-10 < 0){
            throw new Exception();
        }else{
            this.health -= 10;
            System.out.println("적팀 비행기 공격 당함!! ( 현재 체력 : "+this.health+" )");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void printError(){
        System.err.println("적팀 비행기 체력이 10 미만이므로 에러 발생! (현재 체력 : "+this.health+")");
    }
}

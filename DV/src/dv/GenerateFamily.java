package dv;

public class GenerateFamily {
     
    public void go(int level) {
        GenerateFamily work = new GenerateFamily();
        // create all of the stats
        // note: SOMETHING
        // print out all of the stats
        work.print(level);
    }

    public int familyMembers(int level) {
        int familyMembers;
        
        switch(level) {
            case 1: familyMembers = 3;
                    break;
            case 2: familyMembers = 5;
                    break;
            case 3: familyMembers = 7;
                    break;
            default: familyMembers = 3;
        }
        
        // do we need this line???
        // this.familyMembers = familyMembers;
        
        return familyMembers;
    }

    public int foodPounds(int level) {
        int foodPounds;
        
        switch(level) {
            case 1: foodPounds = 500;
                    break;
            case 2: foodPounds = 1000;
                    break;
            case 3: foodPounds = 1500;
                    break;
            default: foodPounds = 500;
        }
        
        // do we need this line???
        // this.foodPounds = foodPounds;
        
        return foodPounds;
    }

    public int ammo(int level) {
        int ammo;
        
        switch(level) {
            case 1: ammo = 10;
                    break;
            case 2: ammo = 25;
                    break;
            case 3: ammo = 50;
                    break;
            default: ammo = 10;
        }
        
        // do we need this line???
        // this.ammo = ammo;
        
        return ammo;
    }

    public int health(int level) {
        int health;
        
        switch(level) {
            case 1: health = 3;
                    break;
            case 2: health = 5;
                    break;
            case 3: health = 7;
                    break;
            default: health = 3;
        }
        
        // do we need this line???
        // this.health = health;
        
        return health;
    }

    public int morale(int level) {
        int morale;
        
        switch(level) {
            case 1: morale = 3;
                    break;
            case 2: morale = 5;
                    break;
            case 3: morale = 7;
                    break;
            default: morale = 3;
        }
        
        // do we need this line???
        // this.morale = morale;
        
        return morale;
    }

    public int pace(int level) {
        int pace;
        
        switch(level) {
            case 1: pace = 1;
                    break;
            case 2: pace = 2;
                    break;
            case 3: pace = 3;
                    break;
            default: pace = 1;
        }
        
        // do we need this line???
        // this.pace = pace;
        
        return pace;
    }

    public int wagonHealth(int level) {
        int wagonHealth;
        
        switch(level) {
            case 1: wagonHealth = 1;
                    break;
            case 2: wagonHealth = 2;
                    break;
            case 3: wagonHealth = 3;
                    break;
            default: wagonHealth = 1;
        }
        
        // do we need this line???
        // this.wagonHealth = wagonHealth;
        
        return wagonHealth;
    }

    public int waterLevel(int level) {
        int waterLevel;
        
        switch(level) {
            case 1: waterLevel = 1;
                    break;
            case 2: waterLevel = 2;
                    break;
            case 3: waterLevel = 3;
                    break;
            default: waterLevel = 1;
        }
        
        // do we need this line???
        // this.waterLevel = waterLevel;
        
        return waterLevel;
    }
    
    public int oxen(int level) {
        int oxen;
        
        switch(level) {
            case 1: oxen = 4;
                    break;
            case 2: oxen = 6;
                    break;
            case 3: oxen = 8;
                    break;
            default: oxen = 4;
        }
        
        // do we need this line???
        // this.oxen = oxen;
        
        return oxen;
    }

    public int distance() {
        int distance = 0;
        
        // do we need this line???
        // this.distance = distance;
        
        return distance;
    }

    public boolean skills(int level) {
        boolean skills;
        
        switch(level) {
            case 1: skills = false;
                    break;
            case 2: skills = true;
                    break;
            case 3: skills = true;
                    break;
            default: skills = false;
        }
        
        // do we need this line???
        // this.skills = skills;
        
        return skills;
    }

    public boolean extremeWeather() {
        boolean extremeWeather = false;
        
        // do we need this line???
        // this.extremeWeather = extremeWeather;
        
        return extremeWeather;
    }

    public int[] temps(int level) {
        int[] temps = new int[5];
        
        switch(level) {
            case 1: temps[0] = 4;
                    temps[1] = 5;
                    temps[2] = 6;
                    temps[3] = 7;
                    temps[4] = 8;
                    break;
            case 2: temps[0] = 2;
                    temps[1] = 3;
                    temps[2] = 5;
                    temps[3] = 8;
                    temps[4] = 9;
                    break;
            case 3: temps[0] = 1;
                    temps[1] = 2;
                    temps[2] = 3;
                    temps[3] = 9;
                    temps[4] = 10;
                    break;
            default: temps[0] = 4;
                    temps[1] = 5;
                    temps[2] = 6;
                    temps[3] = 7;
                    temps[4] = 8;
        }
        
        // do we need this line???
        // this.temps = temps;

        return temps;
    }

    public void print(int level){
        System.out.println("--- PRINT STATS ---");
        GenerateFamily work = new GenerateFamily();
        // get the stats somehow
        // print out the stats
    }
}


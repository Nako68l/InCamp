/**
 * Created by Nako732 on 08.05.2017.
 */
class LHC {
    constructor() {
        this.yourSpeed = 0;
        this.explosionChance = 0;
        this.randomExpl = Math.floor(Math.random() * 100);
    };
    speedUp() {
        this.yourSpeed += 1;
        this.explosionChance += 10;
        console.log(this.check());
    };
    check() {
        if (this.explosionChance > this.randomExpl)return "BOOOOOOOOOOOM";
        if (this.explosionChance >= 90) return "U R lucky one, be careful";
        return "Your speed: "+this.yourSpeed + " Chance of LHC explosion: " + this.explosionChance;
    }
}
class betterLHC extends LHC{
    constructor(){
        super();
    }
    speedDown() {
        this.yourSpeed -= 1;
        this.explosionChance -= 10;
        console.log(this.check());
    }
    check(){
        if (this.explosionChance > this.randomExpl)return "BOOOOOOOOOOOM";
        if (this.explosionChance >= 90) return "You discovered the Higgs boson";
        if (this.yourSpeed < 0) return "U R crashing physics";
        return "Your speed: "+this.yourSpeed + " Chance of LHC explosion: " + this.explosionChance;
    }
}

let firstCollider = new LHC();
for(let i =0; i<10; i++){
    firstCollider.speedUp();
}
let secondCollider = new betterLHC();
secondCollider.speedUp();
secondCollider.speedDown();



public class Zoo {
    Master king =new Master();
    Tiger tigerKing = new Tiger(1);
    Tiger tigerB=new Tiger();
    Lion lionA=new Lion();
    Lion lionB=new Lion();
    Lion lionKing=new Lion(1);
    Rabbit rabbit[]=new Rabbit[15];
    for(int i=0; i<15;i++) {
     rabbit[i]=new Rabbit();
    }
    
    
    public static void main(String[] args){
     
     
     //tigerFeed-eat
     king.tigerFeed(tigerKing);
     king.tigerFeed(tigerKing);
     king.tigerFeed(tigerKing);
     
     king.tigerFeed(tigerB);
     king.tigerFeed(tigerB);
     king.tigerFeed(tigerB);
     
     king.lionFeed(lionKing);
     king.lionFeed(lionKing);
     
     king.lionFeed(lionA);
     king.lionFeed(lionA);
     
     king.lionFeed(lionB);
     king.lionFeed(lionB);
     
     
     //lion vs tiger
      tigerKing.fight(lionKing);
      tigerKing.fight(lionA);
      lionB.fight(tigerKing);
      tigerB.fight(lionB);
     
     
    }
    }
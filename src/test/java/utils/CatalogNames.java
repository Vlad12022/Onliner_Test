package utils;

public enum CatalogNames {
    ONLINER_PRIME(1),
    ELECTRONICS(2),
    COMPUTERS_AND_NETWORKS(3),
    DOMESTIC_TECHNIQUE(4),
    FOR_EVERY_DAY(5),
    CONSTRUCTION_AND_REPAIR(6),
    HOUSE_AND_GARDEN(7),
    CARS_AND_MOTORCYCLES(8),
    BEAUTY_AND_SPORTS(9),
    FOR_CHILDREN_AND_MOTHERS(10);

  private final int index;

  CatalogNames(int index){
     this.index = index;
  }
public int getIndex(){
     return index;
}


}

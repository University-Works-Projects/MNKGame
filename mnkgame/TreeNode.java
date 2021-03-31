package mnkgame;

public class TreeNode {

  private MNKBoard B;           // L'informazione rappresentata dal nodo
  private TreeNode padre;       // Collegamento con il padre

  public TreeNode (MNKBoard in_B, TreeNode in_padre, boolean in_leaf){
    this.B = in_B;
    this.padre = in_padre;
  }
  
  public TreeNode (){   // Crea l'elemento ed inizializza gli elementi a null
    this.padre = null;
  }

  public MNKBoard getMNKBoard () {
    return this.B;
  }
  
  public void setMNKBoard (MNKBoard in_MNKBoard) {
    this.B = in_MNKBoard;
  }

  public TreeNode getPadre () {
    return this.padre;
  }
  
  public void setPadre (TreeNode in_padre) {
    this.padre = in_padre;
  }

}
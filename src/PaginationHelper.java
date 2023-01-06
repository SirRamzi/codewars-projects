import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {
  private List<I> collection;
  private int itemsPerPage;

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return collection.size();
  
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
    return (int) Math.ceil(collection.size() / itemsPerPage + 1);
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    int pageItemCount = -1;
    int edgePages = collection.size() - pageIndex * itemsPerPage;
    if (edgePages >= itemsPerPage) {
      pageItemCount = itemsPerPage;
    } else if (edgePages > 0) {
      pageItemCount = edgePages;
    }
    return pageItemCount;
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    int pageIndex = 0;
    if (itemIndex < collection.size() && itemIndex >= 0) {
      int items = itemIndex;
      while (items > itemsPerPage) {
        items -= itemsPerPage;
        pageIndex++;
      }
    } else return -1;
    return pageIndex;
  
  }
}
package com.azhar.swipetodelete.view;

public interface onMoveAndSwipedListener {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);

}

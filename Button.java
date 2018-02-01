public class Button {
    OnClickListener listener;

    interface OnClickListener {
        void onClick();
    }

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    void touch() {
        listener.onClick();
    }
}

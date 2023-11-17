package Priority_queue;

import java.util.ArrayList;

public class priority_queue<T> {
    ArrayList<element<T>> heap;

    public priority_queue() {
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority) {
        element<T> ele = new element<>(value, priority);
        heap.add(ele);
        int child_indeex = heap.size() - 1;
        int parent_indeex = (child_indeex - 1) / 2;

        while (child_indeex > 0) {
            if (heap.get(child_indeex).priority < heap.get(parent_indeex).priority) {
                element<T> temp = heap.get(child_indeex);
                heap.set(child_indeex, heap.get(parent_indeex));
                heap.set(parent_indeex, temp);
                child_indeex = parent_indeex;
                parent_indeex = (child_indeex - 1) / 2;
            } else {
                return;
            }

        }

    }

    public T get() throws empty_queue_exception {
        if (heap.size() == 0) {
            throw new empty_queue_exception();
        }
        return heap.get(0).value;

    }

    public T get_min() throws empty_queue_exception {
        if (heap.size() == 0) {
            throw new empty_queue_exception();
        }

        return heap.get(0).value;
    }

    public T remove() throws empty_queue_exception {
        if (heap.size() == 0) {
            throw new empty_queue_exception();
        }

        element<T> removed = heap.get(0);
        T value = removed.value;

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int parent_index = 0;
        int left_child_index = 2 * parent_index + 1;
        int right_child_index = 2 * parent_index + 2;

        while (left_child_index < heap.size()) {
            int min_index = parent_index;
            if (heap.get(left_child_index).priority < heap.get(min_index).priority) {
                min_index = left_child_index;
            }
            if (right_child_index < heap.size()
                    && heap.get(right_child_index).priority < heap.get(min_index).priority) {
                min_index = right_child_index;
            }
            if (min_index == parent_index) {
                break;
            }
            element<T> temp = heap.get(parent_index);
            heap.set(parent_index, heap.get(min_index));
            heap.set(min_index, temp);
            parent_index = min_index;
            left_child_index = 2 * parent_index + 1;
            right_child_index = 2 * parent_index + 2;
        }
        return value;

    }

    public int size() {
        return heap.size();
    }

    public boolean is_empty() {
        return heap.size() == 0;
    }

}

package com.koolearn.klibrary.core.view;

public interface ZLViewEnums {
    enum PageIndex {
        previous, current, next;

        public PageIndex getNext() {
            switch (this) {
                case previous:
                    return current;
                case current:
                    return next;
                default:
                    return null;
            }
        }

        public PageIndex getPrevious() {
            switch (this) {
                case next:
                    return current;
                case current:
                    return previous;
                default:
                    return null;
            }
        }
    }

    enum Direction {
        leftToRight(true), rightToLeft(true), up(false), down(false);

        public final boolean IsHorizontal;

        Direction(boolean isHorizontal) {
            IsHorizontal = isHorizontal;
        }
    }

    enum Animation {
        none, curl, slide, slideOldStyle, shift
    }
}

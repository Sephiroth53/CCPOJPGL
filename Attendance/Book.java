class Book {
    private String _name;
    private String _author;
    private int _copy;

        public Book(String _name, String _author, int _copy) {
            this._name = _name;
            this._author = _author;
            this._copy = _copy;
        }

        public String get_Name() {
            return _name;
        }
    
        public String get_Author() {
            return _author;
        }
    
    
        public int get_Copy() {
            return _copy;
        }
    
        public boolean isAvailable() {
            return _copy > 0;
        }
    
        public void borrow() {
            _copy--;
    
        }
    }

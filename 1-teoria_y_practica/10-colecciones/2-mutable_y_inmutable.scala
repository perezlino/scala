/*  ======================================================
    ========== COLECCIONES MUTABLES E INMUTABLES =========
    ======================================================
*/

//  Colecciones Mutables
//  --------------------

// Podemos cambiar el contenido de la colección

scala> val x = scala.collection.mutable.

AbstractBuffer      BufferLike               ImmutableMapAdaptor   LongMap              RedBlackTree        SynchronizedBuffer
AbstractIterable    BufferProxy              ImmutableSetAdaptor   Map                  ResizableArray      SynchronizedMap
AbstractMap         Builder                  IndexedSeq            MapBuilder           ReusableBuilder     SynchronizedPriorityQueue
AbstractSeq         Cloneable                IndexedSeqLike        MapLike              RevertibleHistory   SynchronizedQueue
AbstractSet         DefaultEntry             IndexedSeqOptimized   MapProxy             Seq                 SynchronizedSet
AbstractSortedMap   DefaultMapModel          IndexedSeqView        MultiMap             SeqLike             SynchronizedStack
AbstractSortedSet   DoubleLinkedList         Iterable              MutableList          Set                 Traversable
AnyRefMap           DoubleLinkedListLike     LazyBuilder           ObservableBuffer     SetBuilder          TreeMap
ArrayBuffer         DoublingUnrolledBuffer   LinearSeq             ObservableMap        SetLike             TreeSet
ArrayBuilder        FlatHashTable            LinkedEntry           ObservableSet        SetProxy            Undoable
ArrayLike           GrowingBuilder           LinkedHashMap         OpenHashMap          SortedMap           UnrolledBuffer
ArrayOps            HashEntry                LinkedHashSet         PriorityQueue        SortedSet           WeakHashMap
ArraySeq            HashMap                  LinkedList            PriorityQueueProxy   Stack               WrappedArray
ArrayStack          HashSet                  LinkedListLike        Publisher            StackProxy          WrappedArrayBuilder
BitSet              HashTable                ListBuffer            Queue                StringBuilder
Buffer              History                  ListMap               QueueProxy           Subscriber


//  Colecciones Inmutables
//  ----------------------

// No podemos cambiar el contenido de la colección

scala> val x = scala.collection.immutable.

::                IntMap                List                   LongMapUtils           Page           SortedMap        StringOps        VectorPointer   
AbstractMap       IntMapEntryIterator   ListMap                LongMapValueIterator   PagedSeq       SortedSet        Traversable      WrappedString
BitSet            IntMapIterator        ListSerializeEnd       Map                    Queue          Stack            TreeMap
DefaultMap        IntMapKeyIterator     ListSet                MapLike                Range          Stream           TreeSet
HasForeachEntry   IntMapUtils           LongMap                MapProxy               RedBlackTree   StreamIterator   TrieIterator
HashMap           IntMapValueIterator   LongMapEntryIterator   NewRedBlackTree        Seq            StreamView       Vector
HashSet           Iterable              LongMapIterator        Nil                    Set            StreamViewLike   VectorBuilder
IndexedSeq        LinearSeq             LongMapKeyIterator     NumericRange           SetProxy       StringLike       VectorIterator
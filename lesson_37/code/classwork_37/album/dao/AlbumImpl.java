package classwork_37.album.dao;

import classwork_37.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {
    //
    private Photo[] photos;
    private int size;

    // constructor based on the class AlbumImpl
    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
        this.size = 0;
    }

    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    @Override
    public boolean addPhoto(Photo photo) {
        // bad cases
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        // find index to insert
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        //
        index = index >= 0 ? index : -index - 1;
        // shift array from index right on 1 position
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                // nadvinut "chvost" massiva na i-oje mesto
                System.arraycopy(photos, i + 1, photos, i, size - 1 - i);
                //size--;
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (photo == null) {
            return false;
        }
        photo.setUrl(url); // update url
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);

        // for (int i = 0; i < size; i++) {
        //  if (pattern.equals(photos[i])) {
        ////      return photos[i];
        //  }
        //}

        for (Photo p : photos) {
            if (pattern.equals(p)) {
                return p;
            }

        }
        return null;
    }

    @Override
    public Photo[] getAllPhotosFromAlbum(int albumId) {
        return findByPredicat(p -> p.getAlbumId() == albumId); // condition for Predicat, true or false
    }

    private Photo[] findByPredicat(Predicate<Photo> predicate) {
        Photo[] res = new Photo[size]; // all photos can be there
        int j = 0; // count photos in album
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])) {
                res[j] = photos[i];
                j++;
            }
        }
        return Arrays.copyOf(res, j);
    }

    @Override
    public Photo[] getPhotoBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
        Photo pattern = new Photo(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());
        int from = Arrays.binarySearch(photos, 0, size, pattern, comparator);
        // this is left side
        from = from>= 0 ? from : -from-1;
        // right side
        pattern = new Photo(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = Arrays.binarySearch(photos, 0, size, pattern, comparator);
        to = to >= 0 ? to : - to-1;
        return Arrays.copyOfRange(photos, from, to);
    }

    @Override
    public int size() {
        return size;
    }
}

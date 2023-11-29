// Generated by data binding compiler. Do not edit!
package com.sg.moviesindex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sg.moviesindex.R;
import com.sg.moviesindex.model.tmdb.Movie;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MovieListItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvMovie;

  @NonNull
  public final ImageView ivMovie;

  @NonNull
  public final TextView tvRating;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected Movie mMovie;

  protected MovieListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cvMovie, ImageView ivMovie, TextView tvRating, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvMovie = cvMovie;
    this.ivMovie = ivMovie;
    this.tvRating = tvRating;
    this.tvTitle = tvTitle;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  @NonNull
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MovieListItemBinding>inflateInternal(inflater, R.layout.movie_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MovieListItemBinding>inflateInternal(inflater, R.layout.movie_list_item, null, false, component);
  }

  public static MovieListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MovieListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (MovieListItemBinding)bind(component, view, R.layout.movie_list_item);
  }
}
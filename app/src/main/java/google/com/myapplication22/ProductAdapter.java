package google.com.myapplication22;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP on 05/12/2017.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{
    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout,null);
        ProductViewHolder holder = new ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
Product product = productList.get(position);
holder.textViewTitle.setText(product.getTitle());
        holder.textViewshortdesc.setText(product.getTitle());
        holder.textViewshortdesc.setText(product.getShortdesc());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle,textViewshortdesc;


        public ProductViewHolder(View itemView) {
            super(itemView);
  textViewTitle =(TextView) itemView.findViewById(R.id.textViewTitle);
            textViewshortdesc = (TextView) itemView.findViewById(R.id.textViewShortDesc);
        }
    }
}

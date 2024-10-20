#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node * link;
};

struct node * head;

void display();
void insertBegin();
void insertEnd();
void deleteFistNode();
void deleteLastNode();
void add_at_position();
void countNode();


int InputInt();

int main() {
    for (int i = 0; i < 5; i++)
    {
        insertEnd();
    }

    printf("\nAfter inserting end :: \n");
    display();
    countNode();

    printf("\nAfter inserting begin :: \n");
    insertBegin();
    display();
    countNode();

    printf("\nAfter delete first node :: \n");
    deleteFistNode();
    display();
    countNode();

    printf("\nAfter delete last node :: \n");
    deleteLastNode();
    display();
    countNode();

    printf("\nAdd node :: \n");
    add_at_position();
    display();
    countNode();
    
    return 0;
}

void display() {
    struct node * ptr = head;
    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");
}

void insertBegin() {
    struct node * temp = (struct node * ) malloc (sizeof(struct node));
    
    temp->data = InputInt();
    temp->link = NULL;

    temp->link = head;
    head = temp;    
}

void insertEnd() {
    struct node * temp = (struct node * ) malloc (sizeof(struct node));
    
    temp->data = InputInt();
    temp->link = NULL;

    if (head == NULL)
    {
        head = temp;
    } else {
        struct node * ptr = head;
        while (ptr->link != NULL) {
            ptr = ptr->link;
        }
        ptr->link = temp;
    }
    

}

void countNode() {
    struct node * ptr = head;
    int count = 0;
    while (ptr != NULL)
    {
        ptr = ptr->link;
        count++;
    }
    printf("Node Count is :: %d\n", count);
}

void deleteFistNode() {
    if (head == NULL)
    {
        printf("Linked List is empty!!");
    } else {
        struct node * ptr = head;
        head = head->link;
        free(ptr);
    }   
}

void deleteLastNode() {
    if (head == NULL)
    {
        printf("Linked List is empty!!!");
    } else if (head->link == NULL) {
        free(head);
        head = NULL;
    } else {
        struct node * ptr = head;

        while (ptr->link->link != NULL)
        {
            ptr = ptr->link;
        }
        free(ptr->link);
        ptr->link = NULL;
    }
}

void add_at_position() {
    int position = InputInt(), value = InputInt();
    if (head == NULL)
    {
        printf("Linked List is empty!!!");
    } else if (position == 1) {
        struct node * ptr = (struct node *) malloc (sizeof(struct node));
        ptr->data = value;
        ptr->link = NULL;

        ptr->link = head;
        head = ptr;
    } else {
        struct node * ptr = head;
        struct node * present = (struct node *) malloc (sizeof(struct node));

        present->data = value;
        present->link = NULL;

        position--;
        while (position != 1)
        {
            ptr = ptr->link;
            position--;
        }
        
        present->link = ptr->link;
        ptr->link = present;
    }
}

int InputInt() {
    int value;
    printf("Enter number :: ");
    scanf("%d", &value);
    return value;
}